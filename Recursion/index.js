/* Simple Recursive function 


Dentro da função ele vai imprimir o primeiro valor que lhe foi passado neste caso começamos no zero. E depois 
vai chamar-se a si mesmo ate chegar a condição do IF. 


function printAnElement(index, arr) {
  if (index === arr.length) {
    return;
  }
  console.log(arr[index]);

  printAnElement(index + 1, arr);
}

Quando chamamos a função inicialmente metemos o valor do index que queremos, e depois o array para loopear

printAnElement(0, [1, 2, 3, 4]);
 */

/*

Outra função recursiva usando o debugger, boa cena. 

function power(number, exponent) {
  debugger;
  if (exponent === 1) return number;
  return number * power(number, exponent - 1);
}

console.log(power(2, 5));
*/

//Fibonaci sequence recursion;
function fib(n) {
  debugger;
  if (n === 2 || n === 1) return 1;
  return fib(n - 1) + fib(n - 2);
}

console.log(fib(4));
