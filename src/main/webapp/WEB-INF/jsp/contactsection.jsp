<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="contact-section spad">
	<div class="container-fluid">
		<c:if  test="${success == true}">
			<div class="alert alert-success alert-dismissable">
				<strong>Message sent !! </strong>
			</div>
		</c:if>
		<div class="row">
			<div class="col-xl-8 offset-xl-2">
				<div class="section-title">
					<h2>Contact Me</h2>
				</div>
				<form method="POST" class="contact-form">
					<div class="row">
						<div class="col-md-6">
							<input type="text" name="name" placeholder="Name">
						</div>
						<div class="col-md-6">
							<input type="text" name="email" placeholder="E-mail">
						</div>
						<div class="col-md-12">
							<input type="text" name="subject" placeholder="Subject">
							<textarea placeholder="Message" name="message"></textarea>
						</div>
					</div>
					<div class="text-md-right">
						<button class="site-btn">Send message</button>
					</div>

					<div class="text-md-left">
						<button class="site-btn">update message</button>
					</div>

					<div class="text-md-center">
						<button class="site-btn">delete message</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>