<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="calculator">
    <input type="number" name="op1" placeholder="number 1">
    <select name="opera">
        <option value="+">Add</option>
        <option value="-">Sup</option>
        <option value="*">Multi</option>
        <option value="/">Div</option>
    </select>
    <input type="number" name="op2" placeholder="number 2">
    <button>Calculation</button>
</form>
<h3>${message}</h3>
<h3>${result}</h3>
</body>
</html>
