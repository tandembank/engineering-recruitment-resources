Tandem - dotnet coding challenge
===============================

Message Board API
----------------

Create a REST API web service that allows clients to post and retrieve messages from a message board. The messages can be stored in-memory rather than a datastore. The challenge involves supporting two scenarios which are outlined below:

Instructions
------------

* Use .NET core or .NET framework
* Use an in-memory datastore but consider abstracting this so a remote datastore could be introduced in future.
* The solution should be unit tested
* The solution should be runnable locally
* Have fun, the exercise should hopefully only take around 2 hours - we are not expecting a production complete solution. We'll discuss how this solution could be enhanced in the face to face interview :)

Scenario 1 - POST message
---------------

A client can post messages to a REST API endpoint on the web service. 

- The request must include a **userId** (string) and a **message** (string)
- The request body properties should be case insensitve
- The response body should include the newly created message resource (application/json)
- The message resource must include a **messageId** (unique string), **userId** (string), **message** (string) and **createdDate** (ISO 8601)

Example HTTP request and response:

```
POST /messages HTTP/1.1
Content-Type: application/json
Content-Length: 104

{
  "userId":"simon",
  "message":"Hello darkness, my old friend, I've come to talk with you again"
}
```

```
HTTP/1.1 200 OK
Content-Type: application/json; charset=utf-8
Content-Length: 204

{
  "messageId":"f566037e-3356-48ba-ba0e-da6f88847216",
  "userId":"simon",
  "message":"Hello darkness, my old friend, I've come to talk with you again",
  "createdDate":"2019-03-01T13:43:23.390Z"
}
```

Scenario 2 - GET messages (for given userId)
---------------

A client can get messages for a specified userId from a REST API endpoint on the web service. 

- The request must support a case-insensitive **userId** querystring parameter
- The response body should be a result object with a collection of message resources for the specified userId ordered by createdDate in descending order.
- If a userId does not exist or has no messages the collection should be empty.
- No pagination is necessary
- The message resource must include a **messageId** (unique string), **userId** (string), **message** (string) and **createdDate** (ISO 8601)

Example HTTP request and response:

```
GET /messages?userId=simon HTTP/1.1
```

```json
HTTP/1.1 200 OK
Content-Type: application/json; charset=utf-8
Content-Length: 495

{
  "messages":
  [
    {
      "messageId":"1d481797-d03f-46f3-b2e8-ac51794f6f70",
      "userId":"simon",
      "message":"Because a vision softly creeping, left its seeds while I was sleepin",
      "createdDate":"2019-03-01T13:58:02.468Z"
    },
    {
      "messageId":"f566037e-3356-48ba-ba0e-da6f88847216",
      "userId":"simon",
      "message":"Hello darkness, my old friend, I've come to talk with you again",
      "createdDate":"2019-03-01T13:43:23.390Z"
    }
  ]
}
```
