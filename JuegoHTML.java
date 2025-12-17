<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Juego Misterioso</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #1f1f1f, #3a3a3a);
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .card {
        background: #2c2c2c;
        padding: 25px;
        border-radius: 15px;
        width: 90%;
        max-width: 350px;
        box-shadow: 0 0 15px rgba(0,0,0,0.6);
        text-align: center;
    }

    h1 {
        margin-bottom: 10px;
    }

    input {
        width: 100%;
        padding: 10px;
        margin: 15px 0;
        border-radius: 10px;
        border: none;
        font-size: 16px;
    }

    button {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 10px;
        font-size: 16px;
        background: #ff4444;
        color: white;
        cursor: pointer;
    }

    button:hover {
        background: #ff2222;
    }

    .msg {
        margin-top: 15px;
        min-height: 40px;
