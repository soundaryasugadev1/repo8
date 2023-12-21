Feature: demo Post feature

Scenario: POST request
Given url "https://dummy.restapiexample.com/create"
And request {"status": "success","data": {"name": "test","salary": "123","age": "23","id": 25}}
When method post
And status 201
And print response