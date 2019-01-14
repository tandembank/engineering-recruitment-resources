Tandem - React coding challenge
===============================

Weather Forecast
----------------

Use the OpenWeather API http://openweathermap.org/forecast5 to retrieve data for displaying the weather forecast in 3 hour intervals for the upcoming 5 days in London.

```feature
Scenario: 5 day weather forecast for London
Given I am an unuathenticated first time visitor
When I arrive at the forecast application
Then I am presented a tiled/tabular weather forecast for London
And I see one row per day
And I see a cell for each 3 hour forecast interval, showing time and temperature
```

Bonus scenarios
---------------

These bonus scenarios are designed for us to assess patterns you would use to structure a more complex application. 
If you are applying for a senior role it would be useful to attempt one or more of them.

#### City selection

```feature
Scenario: User can select a city
Given I visit the default London forecast
Then I see a city selector
When I select a city
Then I see an updated forecast for my chosen city
```

#### CSV data source

```feature
Scenario: User can also supply their own forecast data as CSV
Given I visit the default London forecast
Then I see a CSV input
When I supply CSV of `datetime, temperature(K)` forecast intervals 
Then I see an updated forecast showing my arbitrary data
```
Your CSV data should be 1 line per forecast interval `datetime, temperature(K)`:
```
2017-07-23 09:00:00,291.12
2017-07-23 12:00:00,292.00
2017-07-23 15:00:00,289.34
```

Instructions
------------

* Use React or React Native for UI
* Use ES6 or greater (Typescript/Flow are also acceptable)
* The solution should be unit tested
* Don’t pay too much attention to design, functionality is more important
* Consider running it on different devices and orientations
* Include a [README following these guidelines](README.md#readme)
* Read [what we will be looking for](README.md#what-we-look-for)
