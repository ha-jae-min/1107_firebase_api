package org.zerock.api1014.member.exception;

public enum MemberExceptions {

    BAD_AUTH(400,"ID/PW incorrect");


    private MemberTaskException exception;

    MemberExceptions(int statue, String msg) {
        exception = new MemberTaskException(statue, msg);
    }

    public MemberTaskException get() {
        return exception;
    }

}
