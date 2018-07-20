var app = angular.module("app", [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home.html'
	});
	$routeProvider.when('/academies', {
		templateUrl : 'academy.html',
		controller : 'academyCtrl'
	});
	$routeProvider.when('/schedules', {
		templateUrl : 'schedule.html',
		controller : 'scheduleCtrl'
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);

app.controller("academyCtrl", function($scope, $http) {

	$scope.fetchAcademy = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8090/academy/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.academies = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveAcademy = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8090/academy/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.academy
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchAcademy();
			$scope.academies = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});

app.controller("athleteCtrl", function($scope, $http) {

	$scope.fetchAthlete = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8090/academy/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.athletes = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	$scope.saveAthlete = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8090/academy/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.athlete
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchAthlete();
			$scope.athletes = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});
	
app.controller("CoachCtrl", function($scope, $http) {

	$scope.fetchCoach = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8090/academy/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.coachs = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	$scope.saveCoach = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8090/academy/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.coach
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchCoach();
			$scope.coachs = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});

app.controller("GroupCtrl", function($scope, $http) {

	$scope.fetchGroup = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8090/academy/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.groups = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	$scope.saveGroup = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8090/academy/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.group
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchGroup();
			$scope.coachs = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});

app.controller("ScheduleCtrlCtrl", function($scope, $http) {

	$scope.fetchSchedule = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8090/schedule/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.groups = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	$scope.saveSchedule = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8090/schedule/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.schedule
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchSchedule();
			$scope.schedules = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
});