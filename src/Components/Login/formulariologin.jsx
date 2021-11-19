import React, { Component } from 'react';
import '../../Styles/login.css';


export default function FormularioLogin (){
    return(

        <form>
        <input type="text" id="login" class="fadeIn second" name="login" placeholder="login"></input>
        <input type="text" id="password" class="fadeIn third" name="login" placeholder="password"></input>
        <input type="submit" class="fadeIn fourth" value="Log In"></input>
        </form>
    );
}