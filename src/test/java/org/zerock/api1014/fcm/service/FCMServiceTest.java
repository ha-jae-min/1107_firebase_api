package org.zerock.api1014.fcm.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.api1014.fcm.dto.FCMRequestDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
public class FCMServiceTest {

    @Autowired
    FCMService fcmService;

    @Test
    public void test() {

        String token = "fZJa0OECoP6Ouqw8xAV9Pb:APA91bGrHwRqgXYvmG_GbB4jCJpER-MsgO_V2Kl_d46u1ctLxy90ee67dbBU9OSosPfIJ0XxPNACHQ9tPXUxdZBHotsPalpvTd1voZcsEfrXcKqedi7W7CU";
        String title = "수고했어 오늘도";
        String body = "아무도 너의 하루에 관심없대도";

        FCMRequestDTO req = FCMRequestDTO.builder()
                .token(token)
                .title(title)
                .body(body)
                .build();

        fcmService.sendMessage(req);
    }

    @Test
    public void test1() {

        String token = "cfTCpK2OxqA00vmSZ4Jxok:APA91bF2jnlIkOI_B0xM26Jb4-j4XU_1MWmsJsMR6PlMrqVYcimVLGIbaFGpXcq8OJb-kbdwj-CIi6GnaCf8PEdz6yFe9B-2QsFqr4vxwRZ1SwGeTKCQBqY";
        String title = "수고했어 오늘도";
        String body = "아무도 너의 하루에 관심없대도";

        FCMRequestDTO req = FCMRequestDTO.builder()
                .token(token)
                .title(title)
                .body(body)
                .build();

        fcmService.sendMessage(req);
    }

    @Test
    public void test2() {

        String token = "dhU9MNQ1AmV_vf_wzcHIP7:APA91bFa05Qv8VpG-7aCGjnjS-QHWrJ2pPgm7zCBwQdJT_bqKQFIQe1g0ZOFD_LC4jYWA9juj3CBSt3_u1sJkcrRTOlnPVDJUeTmxCCcVsp09BPyrzhVqAA";
        String title = "수고했어 오늘도";
        String body = "아무도 너의 하루에 관심없대도";

        FCMRequestDTO req = FCMRequestDTO.builder()
                .token(token)
                .title(title)
                .body(body)
                .build();

        fcmService.sendMessage(req);
    }

    @Test
    public void test3() {

        String token = "ci1eE9omy3YsLO7I6l7of6:APA91bHOq4S7oLhJIME9R8khndhKrmkwFMW3RT9vwASUlZrKryAKOjeAxAZ5jFX7CX0Nf-jfeT38owilErLfULHFTsxYJQWStUEGuaCjTBhLwNTxn_TEJXY";
        String title = "수고했어 오늘도";
        String body = "아무도 너의 하루에 관심없대도";

        FCMRequestDTO req = FCMRequestDTO.builder()
                .token(token)
                .title(title)
                .body(body)
                .build();

        fcmService.sendMessage(req);
    }

    @Test
    public void testPhone() {

        String token = "cb4CrdlvhCEvjryBGuaVQt:APA91bFXnmBD4hMgEBO1oLoCYvQfiMhkRnd6W68C9ETRH5vFWFH3KGgbVhzOAon-gO_cyTWKeIHL04QuIoMkKQNDIzWJHAs0oxMcdnRiV2BRNjQl4Jyp7Iw";
        String title = "수고했어 오늘도";
        String body = "아무도 너의 하루에 관심없대도";

        FCMRequestDTO req = FCMRequestDTO.builder()
                .token(token)
                .title(title)
                .body(body)
                .build();

        fcmService.sendMessage(req);
    }

}