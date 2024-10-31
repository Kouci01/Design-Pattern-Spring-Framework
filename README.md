# Design Pattern in Spring Framework

## Singleton Design Pattern:
Beans in Spring is a singleton by default, where only one instance of the bean is created for the entire Spring container. Example from Code: ClientComponent bean and SingletonService are created one for the whole spring apps.

## Abstract Factory Design Pattern:
This pattern provide an interface for creating related family of related object without specifying concrete classes. This pattern used when need to create a group of related products and ensure consistency across object within the group. Group Factory -> Group object. Example: 
> _Saving Account and Checking Account -> Bank A Saving Checking Account & Bank B Saving Checking Account._


## Factory Design Pattern
The pattern define an interface for creating an object but subclasses can alter type of object created. This pattern used when need a single object / product type created. Such example: 
> _Notification -> Email Notification and SMS Notification._

## Strategy Design Pattern
This pattern helpful when need to define family of algorithm, encapsulate each one and interchangeable. In strategy pattern can provide same logic but different method's. such as payment process. In payment process, can use cash, credit, etc where each payment methods is different but it is the same for payment.

## Builder Design Pattern
This pattern is useful in construct a complex object with many optional parameters. This pattern allows create an object by specifying only properties needed and skipped some optional parameter. 
For example: 
> User -> Need mainly *email,*password, but can also have firstname, lastname, age, etc. In initiating the User instance, we can use builder as the middle instance in help creation of user instance with some properties needed.

## Command Design Pattern
The command pattern encapsulated a request as an object, allow parameterization and queuing of requests. Example such as Light and Fan have command to turn on and turn off. When the light want to be turn off, then the Light turn off command is created.

## Decorator Design Pattern
Is a structural pattern to add new functionality or properties to an object dynamically, without altering its structure or creating subclasses. Allow flexible and reusable code.
Example of decorator use: 
> _Message -> HtmlMessage: <html> Message </html> -> EncryptedMessage: Encrypted <html> Message </html>_

## Observer Design Pattern
Behaviour design pattern where an object have list of its dependent (observer), and notify automatically when a state is updated or changed. Observer in this pattern is the watcher and the trigger is when an object have some changed.

## Proxy Design Pattern
In this pattern, An instance is used as a placeholder or surrogate for other object to control access to it. This pattern useful for logging, access control, caching, or lazy initialization, without change actual object implementation.

## Adapter Design Pattern
This pattern is used to allow two incompatible interface to work together. In Adapter pattern there is an instance that act as a bridge between two unrelated classes or interface.

## Composite Design Pattern
Composite pattern allows clients to treat individual object and compositions of object uniformly, create hierarchical structure.

## Publisher and Subscriber Design Pattern
This pattern involve events between publisher and subscriber. Publisher can send a message but only to someone that subscribe to the publisher. Example such as broadcast message, where the message only send to intended receiver.
