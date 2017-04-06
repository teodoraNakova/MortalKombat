<%@page import="java.util.HashMap"%>
<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@page import="model.Movie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tiny IMDB</title>
</head>
<body>
<form action="movies">
<h1>Enter movie title</h1> <br>
<input type="text" name="title" required="required"/><br>
<h1>Enter movie year</h1> <br>
<input type="number" name="year" /><br>
<input type="submit" value="Search movie">
</form>
<br>
<% Movie movie = (Movie)session.getAttribute("movie"); %>
<c:if test="${sessionScope.success != null}">
	<c:if test="${sessionScope.success}">
		Title: ${sessionScope.movie.title} <br>
		Year: ${sessionScope.movie.year} <br>
		Rated: ${sessionScope.movie.rated} <br>
		Released : ${sessionScope.movie.released} <br>
		Runtime : ${sessionScope.movie.runtime} <br>
		Genre : ${sessionScope.movie.genre} <br>
		Director : ${sessionScope.movie.director} <br>
		Plot : ${sessionScope.movie.plot} <br>
		IMDB rating: ${sessionScope.movie.imdbRating} <br>
		Poster: <br>
		<img src="${sessionScope.poster}">
	</c:if>
	<c:if test="${!sessionScope.success}">
	<h3>Sorry, no such movie.</h3>
	</c:if>
</c:if>
</body>
</html>
