function checkDigits(inputValue) {
  let sum = 0;
  while (inputValue > 0) {
    sum = sum + (inputValue % 10);
    inputValue = Math.floor(inputValue / 10);
    if (inputValue === 0 && sum > 9) {
      inputValue = sum;
      sum = 0;
    }
  }
  return sum;
}

var inputValue = process.openStdin();
inputValue.addListener("data", function (d) {
  var x = d.toString().trim().split(" ");
  let a = Number(x[0]);
  console.log(checkDigits(a));
});
