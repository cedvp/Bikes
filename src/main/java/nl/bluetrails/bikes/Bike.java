package nl.bluetrails.bikes;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.bluetrails.bikes.parts.Frame;
import nl.bluetrails.bikes.parts.accessories.PedalPair;
import nl.bluetrails.bikes.parts.accessories.Saddle;
import nl.bluetrails.bikes.parts.wheels.Wheel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Bike {
 public Bike(){}
Saddle saddle;
Frame frame;
Wheel frontWheel;
Wheel backWheel;
PedalPair pedalPair;
String brand;
String model;
String bought;
Double  buyingPrice;

 public Saddle getSaddle() {
  return saddle;
 }

 public void setSaddle(Saddle saddle) {
  this.saddle = saddle;
 }

 public Frame getFrame() {
  return frame;
 }

 public void setFrame(Frame frame) {
  this.frame = frame;
 }

 public Wheel getFrontWheel() {
  return frontWheel;
 }

 public void setFrontWheel(Wheel frontWheel) {
  this.frontWheel = frontWheel;
 }

 public Wheel getBackWheel() {
  return backWheel;
 }

 public void setBackWheel(Wheel backWheel) {
  this.backWheel = backWheel;
 }

 public PedalPair getPedalPair() {
  return pedalPair;
 }

 public void setPedalPair(PedalPair pedalPair) {
  this.pedalPair = pedalPair;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getBought() {
  return bought;
 }

 public void setBought(String bought) {
  this.bought = bought;
 }

 public Double getBuyingPrice() {
  return buyingPrice;
 }

 public void setBuyingPrice(Double buyingPrice) {
  this.buyingPrice = buyingPrice;
 }

 public Bike(Saddle saddle, Frame frame, Wheel frontWheel, Wheel backWheel, PedalPair pedalPair, String brand, String model, String bought, Double buyingPrice) {
  this.saddle = saddle;
  this.frame = frame;
  this.frontWheel = frontWheel;
  this.backWheel = backWheel;
  this.pedalPair = pedalPair;
  this.brand = brand;
  this.model = model;
  this.bought = bought;
  this.buyingPrice = buyingPrice;
 }

 @Override
 public String toString() {
  return "Bike{brand='"
          + brand
          + "', model='"
          + model
          + "', bought on='"
          + bought
          + "', at cost of='"
          + buyingPrice
          + "', frame='"
          + frame.toString()
          +   "', frontwheel='"
          + frontWheel.toString()
          +   "', backwheel='"
          + backWheel.toString()
          + "'}";
 }
}