<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="resume-section with-bg spad">
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-7 offset-xl-2">
				<div class="section-title">
					<h2>Education</h2>
				</div>
				<ul class="resume-list">
					<c:forEach items="${educationdatalist}" var="education">
						<li>
							<h2>
								<c:out value="${education.year}"></c:out>
							</h2>
							<h3>
								<c:out value="${education.course}"></c:out>
							</h3>
							<h4>
								<c:out value="${education.college}"></c:out>
							</h4>
							<p>
								<c:out value="${education.description}"></c:out>
							</p>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</section>