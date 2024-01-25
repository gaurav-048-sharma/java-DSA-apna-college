console.log("hello");
let age = 19;
if(age>19) {
    console.log("you are uderage");
} else {
    console.log("not eligible");
}
//let sum = num + num1;
let num = 10;
num = 13;
num = 23;
num2 = 23;
let num1 = 20;
let sum = num + num1+ num2;
//console.log(sum);
// let h1 = document.querySelector("h1");
// h1.addEventListener("mouse", () => {
//     h1.style.backgroundColor = "blue";
// });
answer = 0;
function add() {
    for(let i=0; i<=10; i++) {
        answer = answer+2;
        console.log(answer);
    }
    
};
// add();
// setTimeout (() => {
//     console.log('I am done');
// }, 2000); 

const ages = [22, 23, 24,  25, 26, 27];
for(let i =0; i<ages.length; i++) {
    if(ages[i] % 2 !=0){
        console.log(ages[i]);
    }
    //console.log(ages[i]);
    // } else if(age[i] %2 ==1) {
    //     console.log(ages[i]);
    // }
}
const name = ["rohan", "ravi"];

//console.log(name);

const user = [{
    name : "rohan",
    marks : 78,
},
{
    name : "ravi",
    marks : 88,
    metadata: {
        age: 22,
        address: "",
    }
},
{
    name : "shyam",
    marks : 48,
}   
];
for(let i=0; i<user.length; i++) {
    if(user[i].marks < 80) {
        console.log(user[i].name);
    }
}

function sum4(a,b) {
    return a+b;
};
// console.log(sum4(2,4));

function sum5(n) {
    if(n == 0) {
        return 1;
    }
    return n * sum5(n-1);
}
//console.log(sum5(5));

setTimeout(() => {
    console.log(public(3,5));
    console.log(sum5(5));
}, 2*1000);

// function public(a,b) {
//     return a +b;
// }

function rum(num1=2, num2=4, fn) {
    
    let result = num1 +num2;
    return fn(result);
}
function display(data) {
    console.log("hey"+ data);
}
function passive(data) {
    console.log("ok" + data);
}
rum(1,5, display);

