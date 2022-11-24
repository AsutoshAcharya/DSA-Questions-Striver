function getShortestDist(a, b) {
  let shortestDist = Math.sqrt(a * a + b * b);
  //   console.log(shortestDist);
  return shortestDist;
}

var inputValue = process.openStdin();
inputValue.addListener("data", function (d) {
  var x = d.toString().trim().split(" ");
  let a = Number(x[0]);
  let b = Number(x[1]);
  console.log(getShortestDist(a, b));
});
