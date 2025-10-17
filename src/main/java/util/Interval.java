package util;

import java.util.Date;

public abstract class Interval<T>{
	T low, high;
	Interval(T low, T high){
		this.low = low;
		this.high = high;
	}
}