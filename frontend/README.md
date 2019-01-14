Front-End Engineering - coding challenge / existing code guidelines
===================================================================

We understand that coding challenges can be a significant time investment when searching for a job. Therefore, our [coding challenge](frontend-coding-challenge.md) is optional if you already have some code that you're proud of, can share, and meets our suitability requirements. 

Existing code sample
--------------------

Suitable code examples include:

* Code challenges you may have already completed for other similar roles (you don't need to tell us who for, anonymisation is preferred).
* Significant contributions to a relevant open source project (please reference your pull requests).
* Personal projects using similar technology to the role (output of tutorials/courses are NOT acceptable).

If you have suitable existing code to share, please ensure you abide by the following guidelines:

* Sample code should be relevant to the role being applied for.
* Include a link to a hosted code repository (e.g. Github, Bitbucket...). We cannot review zips, single files, or compiled build artifacts.
* The code must be runnable by the reviewer locally (and include instructions for doing so), or deployed somewhere a reviewer can access to see it in action.
* The repo should include a README that follows the [guidelines below](#readme).
* Has been written solely by you, or you have permission to share anything not written by you<sup>+</sup> (please point out specifically the parts that you are responsible for).
* Does not contain any personally identifiable information, credentials, or anything that you do not have permission to distribute<sup>+</sup>.

Coding challenge
----------------

If you do not have a recent coding sample to share, we ask that you complete a challenge.
[Our current code challenge can be found here](frontend-coding-challenge.md). 

No time limit is imposed, it is designed to be completable within an evening, but open-ended enough for you to showcase your skills beyond the basics if you desire.

You may use any libraries/frameworks/bootstraps you like (unless role specific ones are asked for in the brief), but please explain your choices. 

README
------

For either your own code sample or coding challenge, write your README as if it were for a production service. Do not assume anything of the reader or their existing environment. Include the following items:

* Description of the problem and solution.
* Instructions on any environment setup required.
* Instructions how to run the solution and any test suites.
* Explain your technical choices. 
* Highlight any trade-offs or ommissions you have made, and reasoning behind them.
* What would you do differently, or what would your next steps be if you were to spend additional time on the project.
* Link to the hosted solution if applicable.

How we review your code
-----------------------

As you have taken the time to provide us with your code, we will take the time to review it seriously:

* Your solution will be reviewed by two engineers.
* We will take into consideration your experience level, and adjust expectations accordingly.
* We will supply feedback on your solution.
* We will use your code to refer to as a further talking point in subsequent face to face interviews.

What we look for
----------------

**We value quality over feature-completeness**. It is fine to leave portions aside provided you call them out in your project's README. The goal of this code sample is to help us identify what you consider to be production-ready code. You should consider this code ready for a pull request for your colleague to review.

Aspects of your code we will assess include:

* **Clarity**: does the README clearly and concisely explain the problem and solution? Are technical tradeoffs explained?
* **Correctness**: does the solution fulfil the brief? If there is anything missing, does the README explain why it is missing?
* **Code quality**: is the code simple, easy to understand, and maintainable? Are there any code smells or other red flags? Does object-oriented code follow principles such as the single responsibility principle? Is functional code pure? Is the coding style consistent with the language's guidelines? Is it consistent throughout the codebase?
* **Technical/architectural choices**: do choices of libraries, architecture etc. seem appropriate?
* **Security**: are there any obvious vulnerabilities?
* **Testing**: how thorough are the test suites? Will they be difficult to change if the requirements of the application were to change? Are they brittle?
	* We're not looking for full coverage, simply getting a feel for your testing skills.
* **UI**: is UI responsive / mobile-first?
    * We're not looking for design skills, but want to see that you understand and can work with device constraints using modern techniques.

Bonus points (optional but well received):

* **Scalability**: will technical choices scale well? If not, is there a discussion of those choices in the README? 
* **Production-readiness**: does the code take into account error-handling, monitoring, or logging?

The smallprint
-------------- 
<sup>+</sup> Tandem is not liable for you sharing with us anything that you do not have permission for, and cannot accept solutions that contain or expose sensitive or personally identifiable information.
