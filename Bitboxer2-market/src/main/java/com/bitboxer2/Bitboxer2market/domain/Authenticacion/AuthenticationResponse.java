package com.bitboxer2.Bitboxer2market.domain.Authenticacion;

public class AuthenticationResponse {

    private String jwtoken;

    public AuthenticationResponse(String jwToken) {
        jwtoken= jwToken;
    }

    public String getJwtoken() {
        return jwtoken;
    }

    public void setJwtoken(String jwtoken) {
        this.jwtoken = jwtoken;
    }
}
