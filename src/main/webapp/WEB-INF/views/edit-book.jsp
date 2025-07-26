<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Book</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50 text-gray-800">
<%@ include file="/WEB-INF/views/components/nav.jsp" %>
<div class="max-w-5xl mx-auto px-6 py-8">
    <h1 class="text-4xl font-bold mb-6 text-center text-navy-800">Edit Book</h1>
    <form action="${pageContext.request.contextPath}/books/edit/${editBook.bookId}" method="post" class="space-y-4">
        <input type="hidden" name="_method" value="put" />
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Book Name:</label>
            <input type="text" name="bookName" placeholder="${editBook.bookName}" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Author Name:</label>
            <input type="text" name="authorName" placeholder="${editBook.authorName}"class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Book Number:</label>
            <input type="number" name="bookNumber" placeholder="${editBook.bookNumber}" class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex items-center">
            <label class="w-40 font-medium text-lg">Quantity:</label>
            <input type="number" name="bookQuantity" placeholder="${editBook.bookQuantity}"class="flex-1 border border-gray-300 p-2 rounded text-lg" required>
        </div>
        <div class="flex justify-end gap-2 mt-4">
            <a href="${pageContext.request.contextPath}/books" class="bg-gray-500 text-white px-4 py-2 rounded">Cancel</a>
            <button type="submit" class="bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded">Update</button>
        </div>
    </form>
</div>
</body>
</html>
