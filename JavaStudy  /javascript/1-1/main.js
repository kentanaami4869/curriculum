let numbers = [2, 5, 12, 13, 15, 18, 22];
console.log(numbers[0]);
console.log(numbers[2]);
console.log(numbers[5]);
console.log(numbers[6]);
function isEven() {

    
    console.log(num + 'は偶数です');  
    }
    
class Car {
    constructor(gas,num){
        this.gas=gas;
        this.num=num;
    }

    getNumGas() {
        console.log(`ガソリンは${this.gas}です,ナンバーは${this.num}です`);
    }  
}
let car = new Car(12,4869);
car.getNumGas();
    