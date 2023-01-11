/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {


// Define roman numerals
    const romanNumerals = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    }


// set our initial result to 0
    let number = 0;

//use a for loop to loop through all possible numerals
    for (index=0; index < s.length; index++){
      const current = romanNumerals[s[index]]; //define current numeral as the index in current loop
      const next = romanNumerals[s[index+1]]; //define subsequent numeral as the index in current loop + 1

    if (current < next){
        number += next - current //Allows for subtraction of roman numerals from other roman numerals. i.e. (IX = 10-1 = 9).
        index++;
    } else {
        number += current
    }
}
    return number
}