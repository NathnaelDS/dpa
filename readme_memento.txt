Memento pattern is used to restore state of an object to a previous state.
There are usually three classes. A Memento, Originator and Caretaker classes.
Memento object contains state of an object to be restored. 
Originator object creates and stores states in Memento objects.
Caretaker object is object that lets us to restore object states from Memento.
It has the advantage of storing and/or restoring previous states. 
But there is overhead of creating classes that take care of storing copies, storing the actual data and the care-taker class.