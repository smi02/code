var heights = document.getElementById('height')
var weights = document.getElementById('weight')
function calculate(height, weight) {
    if(height <= 0 || weight <= 0 || isNaN(height) || isNaN(weight)){
        console.log('Please enter the correct data');
    }else{
        height = height/100
        let bmi = weight/Math.pow(height,2)
        console.log('your height is ' + height + ' m');
        console.log('your weight is ' + weight + ' kg');
        console.log('your BMI: ' + bmi.toFixed(2) + ' kg/m2');
        return bmi;
    }
}
var btn = document.getElementById('btn')
btn.onclick = function result(){
    var height = heights.value;
    var weight = weights.value;
    bmi = calculate(height, weight);
    if(bmi < 18.5){
        console.log('You are thin, the risk of disease is low')
    }else if(bmi >= 18.5 && bmi <25){
        console.log('You are normal, the risk of disease is moderate')
    }else if(bmi >=25 && bmi < 30){
        console.log('You are a bit fat, the risk of disease is high')
    }else if(bmi >= 30 && bmi< 35){
        console.log('You are obese level 1, the risk of developing the disease is high')
    }else if(bmi >= 35 && bmi < 40){
        console.log('You are obese level 2, the risk of developing the disease is very high')
    }else if(bmi >= 40){
        console.log('You are obese level 3, the risk of developing dangerous diseases')
    }
    console.log('------------------------------')
}