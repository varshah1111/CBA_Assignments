// function msg(){
//     alert('Hello this is a alert msg');
// }
// function change(){
//     // document.getElementById("demo").innerText="Changes Text";
//     document.getElementById("demo").innerHTML="<h1>Changes Text</h1>";
//   }


//   function add(){
//     let n1=Number(document.getElementById("num1").value);
//      let n2=Number(document.getElementById("num2").value);
//      let sum=n1+n2;
//      document.getElementById("result").innerText="Sum: " +sum;
//   }

// let n=123;
// let s="Varsha";
// let b=true;
// let N;
// let c=null;
// console.log(typeof n);
// console.log(typeof s);
// console.log(typeof b);
// console.log(typeof N);
// console.log(typeof c);

// let num="111";
// let ans=Number(num)
// console.log(typeof ans);

// let n="25";
// let ans=Number(n);
// console.log(typeof ans);
// let ans1=n+"25";
// console.log(ans1);

// console.log("10" + 5)
// console.log ("10" -5)
// console.log(true + 2)
// console.log(false + "test")

// let n=123;
// console.log(typeof n);
// console.log(String(n));
// console.log(Boolean(n));
// console.log(Number(n));

// var name="varsha"
// let age=21
// const country="India";
// console.log(name);
// console.log(age);
// console.log(country);

// let str="42";
// let num=Number(str);
// console.log(num+8);

// let num=100;
// console.log(num);
// const str=String(num);
// console.log(typeof str);
// console.log(str);

// console.log(Boolean(""));        // false
// console.log(Boolean("hello"));   // true
// console.log(Boolean(0));         // false
// console.log(Boolean(1));         // true
// console.log(Boolean(null));      // false
// console.log(Boolean(undefined)); // false

// console.log("5" + 5);
// console.log("5" - 2);
// console.log("5" * "2");
// console.log(5 + true);
// console.log("10" - true);

// function msg(){
//     let n=document.getElementById("num1").value;
//     document.getElementById("res").innerText=(typeof n)
//     document.getElementById("number").innerText=Number(n)
//     document.getElementById("b").innerText=Boolean(n)
// }

// let n=null;
// let m;
// console.log(n);
// console.log(typeof n);
// console.log(m);
// console.log(typeof m);

// let n=["", 0, 123, undefined, NaN, true];
// n.forEach(val=>{
//     if(val){
//         console.log(val+ " is truthy");
//     }
//     else{
//         console.log(val+ " is falsy"); 
//     }
// })

// let marks=90;
// if(marks>90){
//     console.log("Grade A");
// }
// else if(marks>=70){
//     console.log("Grade B")
// }
// else{
//     console.log("Grade C");
// }

// let marks = 35;
// if (marks <= 45 && marks<70) {
//   console.log("Grade C");
// } else if (marks >= 70 && marks<90) {
//   console.log("Grade B");
// } else {
//   console.log("Grade A");
// }


// Write a programme to to validate the date in dd,mm and yyyy format
// int dd,mm,yyyy;
// dd=29;
// mm=2;
// yyyy=2024;
// let dd = 31, m = 4, yyyy = 2024;

// if (dd <= 0 || m <= 0 || m > 12) {
//     console.log("Invalid");
// } 
// else if (m == 2) {
//     // Check for leap year
//     if ((yyyy % 4 === 0 && yyyy % 100 !== 0) || (yyyy % 400 === 0)) {
//         if (dd <= 29) {
//             console.log("Valid");
//         } else {
//             console.log("Invalid");
//         }
//     } else {
//         if (dd <= 28) {
//             console.log("Valid");
//         } else {
//             console.log("Invalid");
//         }
//     }
// } 
// else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
//     if (dd <= 31) {
//         console.log("Valid");
//     } else {
//         console.log("Invalid");
//     }
// } 
// else if (m == 4 || m == 6 || m == 9 || m == 11) {
//     if (dd <= 30) {
//         console.log("Valid");
//     } else {
//         console.log("Invalid");
//     }
// } 
// else {
//     console.log("Invalid");
// }

// let dd = 31, mm = 4, yyyy = 2024;

// let day= [0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

// if ((yyyy % 4 === 0 && yyyy % 100 !== 0) || (yyyy % 400 === 0)) {
//     day[2] = 29;
// }

// if (mm >= 1 && mm <= 12 && dd >= 1 && dd <= day[mm]) {
//     console.log("Valid date");
// } else {
//     console.log("Invalid date");
// }

// let dd = 31, mm = 3, yyyy = 2024;

// function isLeapYear(year) {
//     return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
// }

// function isValidDate(dd, mm, yyyy) {
//     if (dd <= 0 || mm <= 0 || mm > 12) {
//         return false;
//     }

//     let daysInMonth;

//     switch (mm) {
//         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//             daysInMonth = 31;
//             break;
//         case 4: case 6: case 9: case 11:
//             daysInMonth = 30;
//             break;
//         case 2:
//             daysInMonth = isLeapYear(yyyy) ? 29 : 28;
//             break;
//         default:
//             return false;
//     }

//     return dd <= daysInMonth;
// }

// if (isValidDate(dd, mm, yyyy)) {
//     console.log("Valid");
// } else {
//     console.log("Invalid");
// }

// const even= a =>(a%2===0) ? "even":"odd";
// console.log(even(11));

// var x=100;
// function shadow(){
//     var x=50;
//     console.log(x);
// }
// shadow();
// console.log(x);

// const sayhello=(name)=>{
//     console.log("Hello "+name);
// }
// sayhello("varsha");

// const fruits=[40,100,2,1];
// let sum=fruits.filter(my1)
// function my1(value,index,array){
//     return value>18;
// }
// console.log(sum);
// let arr=new Array();
// arr.push(5);
// arr.push(3);
// arr.push(3);
// console.log(arr);

// let obj={name:"varsha", age:21};
// console.log("name" in obj);
// for(let key in obj){
//     console.log(key, ":" ,obj[key]);
// }
// console.log(Object.entries(obj));

// ages=[12,33,45,35,12,11,50];
// function chexkage(age){
//     return age>18
// }
// console.log(ages.findLastIndex(chexkage));

// friut=["Apple","Banana","Carrot"];
// console.log(friut.includes("Apple"))

// number=[1,2,[3,4,[5,6],7],8];
// console.log(number.flat());

// age=[1,2,3,4,5];
// console.log(age.map(x=>x*10));

// const time=new Date();
// console.log(time.getMilliseconds());
// function display(some){
//     console.log(some);
// }
// function sum(n1,n2,callback){
//     let sum=n1+n2;
//     callback(sum);
// }
// sum(5,1,display);

function checksum(num){
    let p= new Promise((resolve,reject)=>{
        if(num%2===0){
        resolve("even");
        }
        else{
        reject("odd")
        }
    })
    p.then((message) => {
        console.log("Resolved:", message);
      }).catch((error) => {
        console.log("Rejected:", error);
      });
    }
checksum(4);
checksum(5);