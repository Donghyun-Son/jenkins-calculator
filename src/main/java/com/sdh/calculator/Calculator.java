package com.sdh.calculator;

import org.springframework.stereotype.Service;

/**
 * This is Javadoc sample
 * @author SDH
 */
@Service
public class Calculator {
	/** calculate sum
	 * @param a
	 * @param b
	 * @return int
	 */
	int sum(int a, int b) {
		return a + b;
	}
	/** calculate sub
	 * @param a
	 * @param b
	 * @return int
	 */
	int sub(int a, int b) {
		return a - b;
	}
	/** calculate mul
	 * @param a
	 * @param b
	 * @return int
	 */
	int mul(int a, int b) {
		return a * b;
	}
	/** calculate div
	 * @param a
	 * @param b
	 * @return int
	 */
	int div(int a, int b) {
		return a / b;
	}
}
