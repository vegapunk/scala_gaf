package com.vega.gaf.immutable.selection
import com.vega.gaf.immutable.environment.Population

/**
 * Should be used to select which Chromosomes will go into the next round of iterations
 */
trait Selection[T] {

	/**
	 * Implementations should return a new population of the given size from the given
	 * population
	 */
	protected def select(env:Population[T], size:Int) : Population[T]
	
}