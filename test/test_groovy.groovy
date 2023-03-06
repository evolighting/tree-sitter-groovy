// groovy
println "Hello, World!"

// basic 
x = 1
x = y[1]
x = z(a,b,c)


// variable
x = 1
x = new java.util.Date()
x = -3.1499392
x = false
x = "Hi"

// list
myList = [1776, -1, 33, 99, 0, 928734928763]
println myList[0]
println myList.size()

// map
scores = [ "Brett":100, "Pete":"Did not finish", "Andrew":86.87934 ]

// function
def foo() {
    'Hello world'
}

def bar(alpha, omega) {
    alpha + omega
}

// multiple assignment
(a, b, c) = [10, 20, 'foo']
assert a == 10 && b == 20 && c == 'foo'


// for in
for ( i in 0..9 ) {
    x += i
}
assert x == 45