package org.zerock.api1014.fcm.service;

import com.google.firebase.FirebaseException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.api1014.fcm.dto.FCMRequestDTO;
import org.zerock.api1014.fcm.exceptions.FCMMessageException;

@Service
@RequiredArgsConstructor
@Log4j2
public class FCMService {

    private final FirebaseMessaging firebaseMessaging;

    public void sendMessage(FCMRequestDTO fcmRequestDTO) {

        if(fcmRequestDTO == null) {
            throw new FCMMessageException("fcmRequestDTO is null");
        }
        if(fcmRequestDTO.getToken() == null) {
            throw new FCMMessageException("fcmRequestDTO.getToken is null");
        }

        if(fcmRequestDTO.getTitle() == null || fcmRequestDTO.getTitle().isEmpty()) {
            throw new FCMMessageException("title is null or empty");
        }

        Notification notification = Notification.builder()
                .setBody(fcmRequestDTO.getBody())
                .setTitle(fcmRequestDTO.getTitle())
                .build();

        Message message = Message.builder()
                .setToken(fcmRequestDTO.getToken())
                .setNotification(notification)
                .build();


        try {
            firebaseMessaging.send(message);
        } catch (FirebaseMessagingException e) {
            throw new FCMMessageException(e.getMessage());
        }

    }
}

