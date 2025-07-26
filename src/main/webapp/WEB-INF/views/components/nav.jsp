<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="bg-blue-900 text-white px-6 py-4 shadow-md">
    <div class="max-w-6xl mx-auto flex justify-between items-center">
        <span class="text-2xl font-semibold">Library Summer Camp</span>
        <div class="space-x-6 text-lg">
            <a href="${pageContext.request.contextPath}/" class="hover:text-gray-200">Home</a>
            <a href="${pageContext.request.contextPath}/books" class="hover:text-gray-200">View Books</a>
            <a href="${pageContext.request.contextPath}/books/new" class="hover:text-gray-200">Add Book</a>
        </div>
    </div>
</nav>
