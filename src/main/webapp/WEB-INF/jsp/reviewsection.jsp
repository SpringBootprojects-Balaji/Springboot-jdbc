<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="review-section spad pb-0">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xl-7 offset-xl-2">
					<div class="section-title">
						<h2>References</h2>
					</div>
					<div class="review-slider owl-carousel">
				    <c:forEach items="${references}" var="reference">
						<div class="single-review">
							<div class="qut">&ldquo;</div>
							<p><c:out value="${reference.description}"></c:out></p>
							<h3><c:out value="${reference.customer}"></c:out></h3>
							<h4><c:out value="${reference.role}"></c:out>, <c:out value="${reference.company}"></c:out></h4>
						</div>
					</c:forEach>
					
					</div>
				</div>
			</div>
		</div>
	</section>