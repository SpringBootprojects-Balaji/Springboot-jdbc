<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Hero section start -->
	<section class="hero-section spad">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xl-10 offset-xl-1">
					<div class="row">
						<div class="col-lg-6">
							<div class="hero-text">
								<h2>${heading}</h2>
								<p>${description}</p>
							</div>
							<div class="hero-info">
								<h2>General Info</h2>
								<ul>
									<li><span>Date of Birth</span>${dateofbirth}</li>
									<li><span>Address</span>${address}</li>
									<li><span>E-mail</span>${email}</li>
									<li><span>Phone </span>${phone}</li>
								</ul>
							</div>
						</div>
						<div class="col-lg-6">
							<figure class="hero-image">
								<img src="img/hero.jpg" alt="5">
							</figure>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Hero section end -->