import React, { Component } from 'react';
import '../../Styles/login.css';
import { ReactComponent as Bitboxlogo } from '../../svg/bitbox.svg';

export default function Login(props){


    return(
        <div className="col form-signin" >
            <div class="wrapper fadeInDown">
            <div id="formContent">

                <div class="fadeIn first">
                <Bitboxlogo></Bitboxlogo>
                </div>

                <form>
                <input type="text" id="login" class="fadeIn second" name="login" placeholder="login"></input>
                <input type="text" id="password" class="fadeIn third" name="login" placeholder="password"></input>
                <input type="submit" class="fadeIn fourth" value="Log In"></input>
                </form>

                <div id="formFooter">
                <a class="underlineHover" href="#">Forgot Password?</a>
                </div>

            </div>
            </div>

        </div>
    );
}