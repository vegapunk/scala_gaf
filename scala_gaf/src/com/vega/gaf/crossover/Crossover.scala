package com.vega.gaf.crossover
import com.vega.gaf.chromosome.Chromosome
import com.vega.gaf.gene.Gene

trait Crossover[T] {

	/**
	 * Takes 2 chromosomes of the same type and returns a new chromosome according to some rules
	 */
	def crossover(a : Chromosome[T], b: Chromosome[T]) : Chromosome[T]
	
}