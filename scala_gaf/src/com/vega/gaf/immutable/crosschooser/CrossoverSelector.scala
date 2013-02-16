package com.vega.gaf.immutable.crosschooser
import com.vega.gaf.immutable.chromosome.Chromosome
import com.vega.gaf.immutable.environment.Population

/**
 * Should be used to select from a population a list of pairs of Chromosomes to be crossed over
 */
trait CrossoverSelector[T] {

	def selectForCrossover(pop: Population[T]): List[Pair[Chromosome[T], Chromosome[T]]]
	
}