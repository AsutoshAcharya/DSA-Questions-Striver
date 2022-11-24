function numString(inputStringArray) {
  const result = [];
  for (let i = 0; i < inputStringArray.length; i++) {
    if (containsNumbers(inputStringArray[i])) {
      result.push(inputStringArray[i]);
    }
  }

  return result;
}
function containsNumbers(str) {
  return /\d/.test(str);
}
var stdin = process.openStdin();
stdin.addListener("data", function (d) {
  var x = d.toString().trim().split(" ");
  let size = parseInt(x[0]);
  var inparr = new Array(size);
  for (let i = 0; i < size; i++) {
    inparr[i] = x[i + 1];
  }

  let result = numString(inparr);
  for (let i = 0; i < result.length; i++) {
    console.log(result[i]);
  }
});
