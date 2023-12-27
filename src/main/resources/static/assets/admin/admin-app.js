app = angular.module("admin-app",["ngRoute"]);

app.config(function ($routeProvider){
	$routeProvider
	.when("/product",{
		templateUrl:"/assets/admin/product/index.html",
		controller:"product-ctrl"
	})
	.when("/authorize",{
		templateUrl:"/assets/admin/authority/index.html",
		controller:"authority-ctrl"
	})
	.when("/unthorized",{
		templateUrl:"/assets/admin/authority/unauthorized.html",
		controller:"authority-ctrl"
	})
	.when("/danhmuc",{
		templateUrl:"/assets/admin/danhmuc/index.html",
		controller:"danhmuc-ctrl"
	})
	.when("/giaovien",{
		templateUrl:"/assets/admin/giaovien/index.html",
		controller:"giaovien-ctrl"
	})
	.otherwise({
		template:"<h1 class='text-center'>FPT Polytechnic Administation</h1>"
	});
})