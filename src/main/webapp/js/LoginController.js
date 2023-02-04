mainApp.controller('LoginController', function($scope, $http) {
	
	 $scope.message = 'Hello from FirstController'; 
	
 


 $scope.login = function(username, password) {

var data = {

        username: username,

        password: password,

        roles: ["USER"]

    };
    $http.post('/api/auth/signin', JSON.stringify(data)).then(function(response) {

        if (response.data)

            $scope.msg = "Post Data Submitted Successfully!";

    }, function(response) {

        $scope.msg = "Service not Exists";

        $scope.statusval = response.status;

        $scope.statustext = response.statusText;

        $scope.headers = response.headers();

    });

        
    }

});
