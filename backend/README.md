# Juniper Square Interview Kit

This README will walk you through the setup and use of the Juniper Square Interview Kit, which you've successfully received and unzipped if you're reading this message.

This is the interview kit for *Back End* candidates. If you've received this interview kit in error, please let your interviewer know and we'll provide you with the correct kit.

This exercise is *not designed to be completed*; the goal isn't to finish the entire implementation, but rather provide a large surface area where you can focus on aspects you feel best showcase the skills you'd like to show us. Best practices matter! Aim to submit a solution which would pass your own code review.

## Getting Started

You will need to have Docker installed. Download here:
https://www.docker.com/products/docker-desktop

Run this command from the same directory containing this README file:
```
$ docker-compose up
```

After the services are running, you should be able to view the OpenAPI documentation at http://localhost:8080.

## The Goal

You will be implementing the API described by the OpenAPI specification, viewable at http://localhost:8080.

At a high level, the API represents a basic Customer Relations Management (CRM) application, which is a simplified version of the one used by customers of Juniper Square. The core object is a `User`, which has a `name` and `email`, as well as a list of tags to group users logically. Users may also have notes attached to them.

Your solution will *not* be graded on completing each endpoint, which would exceed the 90 minutes allotted for this exercise. Instead, we'd like you to focus on the way the software is built, and deliver the best solution you can for the _subset_ of APIs you choose to implement.