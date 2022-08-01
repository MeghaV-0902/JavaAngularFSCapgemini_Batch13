import { Component, Input, OnChanges, SimpleChange, SimpleChanges } from "@angular/core";

@Component(
    {
        selector:'simple',
        template:
        `you have enterd: {{simpleInput}}
        `
    }
)

export class SimpleComponent implements OnChanges
{
    @Input('simpleInput') simpleInput;
 ngOnChanges(changes: SimpleChanges): void {
     for(let propName in changes)
     {
    let chng = changes[propName];
    let cur = JSON.stringify(chng.currentValue);
    let prev=JSON.stringify(chng.previousValue);
    console.log(propName, cur, prev);

     }
     
 }
 
 

 }
 
 