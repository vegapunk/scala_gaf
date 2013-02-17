package com.vega.gaf.immutable.crossover
import com.vega.gaf.immutable.chromosome.Chromosome

trait Crossover[T] {

	/**
	 * Takes 2 chromosomes of the same type and returns a new chromosome according to some rules
	 */
	protected def crossover(a : Chromosome[T], b: Chromosome[T]) : Chromosome[T]
	
}