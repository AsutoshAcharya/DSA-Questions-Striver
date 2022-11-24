function gcdOfNumbers(a, b) {
  let gcd;
  let max = Math.max(a, b);
  for (let i = 1; i <= max; i++) {
    if (a % i === 0 && b % i === 0) {
      gcd = i;
    }
  }
  return gcd;
}

let input = process.openStdin();
input.addListener("data", function (d) {
  let x = d.toString().trim().split(" ");
  let a = Number(x[0]);
  let b = Number(x[1]);
  console.log(gcdOfNumbers(a, b));
});
