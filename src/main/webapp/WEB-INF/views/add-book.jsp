<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50 text-gray-800">
<%@ include file="/WEB-INF/views/components/nav.jsp" %>
<div class="max-w-5xl mx-auto px-6 py-8">
    <h1 class="text-4xl font-bold mb-8 text-center text-navy-800">Add a New Book</h1>
    <form action="${pageContext.request.contextPath}/books" method="post" class="space-y-4">
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Book Name:</label>
            <input type="text" name="bookName" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Author Name:</label>
            <input type="text" name="authorName" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Book Number:</label>
            <input type="number" name="bookNumber" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Quantity:</label>
            <input type="number" name="bookQuantity" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex justify-end mt-4">
            <button type="submit" class="bg-blue-700 text-white px-6 py-2 rounded hover:bg-blue-800 text-lg">Add Book</button>
        </div>
    </form>
</div>
</body>
</html>
