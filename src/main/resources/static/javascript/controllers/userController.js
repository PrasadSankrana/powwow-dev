/**
 * 
 */

var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
	$scope.submitForm = function(){
		var url = $location.absUrl() + "/user";
				
		var config = {
                headers : {
                	'Content-Type': 'application/json'
                }
        }
		$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
		var data = {
				emailId: $scope.email_id,
				password: $scope.password,
				userName: $scope.username
        };
		
		$http.post(url, data, config).then(function (response) {
			$scope.postResultMessage = response.data;
		}, function error(response) {
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
		
		$scope.username = "";
		$scope.email_id = "";
		$scope.password = "";
	}
});

app.controller('getcontroller', function($scope, $http, $location) {
	$scope.getfunction = function(){
		var url = $location.absUrl() + "/user";
		
		$http.get(url).then(function (response) {
			$scope.response = response.data
		}, function error(response) {
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
	}
});