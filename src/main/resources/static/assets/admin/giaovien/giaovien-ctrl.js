app.controller("giaovien-ctrl", function($scope, $http){
	$scope.initialize = function(){
		$http.get("/rest/giaovien").then(resp => {
			$scope.items = resp.data;
		})
		$scope.reset();
	}
	
	$scope.reset = function(){
		$scope.form = {
		}
	}

	$scope.edit = function(gv){
		$scope.form = angular.copy(gv);
		$(".nav-tabs a:eq(0)").tab("show"); // chuyển về tab đầu
	}

	$scope.create = function(){
		var gv = angular.copy($scope.form);
		$http.post(`/rest/giaovien`, gv).then(resp => {
			$scope.items.push(resp.data);
			$scope.reset();
			alert("Thêm mới danh mục mới thành công!");
		}).catch(error => {
			alert("Lỗi thêm mới !");
			console.log("Error", error);
		});
	}

	$scope.update = function(){
		var gv = angular.copy($scope.form);
		$http.put(`/rest/giaovien/${gv.maGV}`, gv).then(resp => {
			var index = $scope.items.findIndex(a => a.maGV == gv.maGV);
			$scope.items[index] = gv;
			alert("Cập nhật danh mục thành công!");
			$(".nav-tabs a:eq(1)").tab("show"); // chuyển về tab 2
		})
		.catch(error => {
			alert("Lỗi cập nhật danh mục!");
			console.log("Error", error);
		});
	}

	$scope.delete = function(gv){
		if(confirm("Bạn muốn xóa danh mục này?")){
			$http.delete(`/rest/giaovien/${gv.maGV}`).then(resp => {
				var index = $scope.items.findIndex(a => a.maGV == gv.maGV);
				$scope.items.splice(index, 1);
				$scope.reset();
				alert("Xóa danh mục thành công!");
			}).catch(error => {
				alert("Lỗi xóa danh mục!");
				console.log("Error", error);
			})
		}
	}

	$scope.initialize();

	$scope.pager = {
		page: 0,
		size: 5,
		get items(){
			if(this.page < 0){
				this.last();
			}
			if(this.page >= this.count){
				this.first();
			}
			var start = this.page*this.size;
			return $scope.items.slice(start, start + this.size)
		},
		get count(){
			return Math.ceil(1.0 * $scope.items.length / this.size);
		},
		first(){
			this.page = 0;
		},
		last(){
			this.page = this.count - 1;
		},
		next(){
			this.page++;
		},
		prev(){
			this.page--;
		}
	}
});