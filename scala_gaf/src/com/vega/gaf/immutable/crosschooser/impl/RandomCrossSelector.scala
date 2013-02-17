package com.vega
import com.vega.gaf.immutable.crosschooser.CrossoverSelector
import com.vega.gaf.immutable.environment.Population
import com.vega.gaf.immutable.chromosome.Chromosome
import scala.util.Random

/**
 * Will select 2 Chromosomes at random from a population.
 * The 2 chromosomes selected can potentially be identical
 */
trait RandomCrossSelector[T] extends CrossoverSelector[T]{

	def selectForCrossover(pop: Population[T]): List[Pair[Chromosome[T], Chromosome[T]]] ={
		def generatePair() : Pair[Chromosome[T], Chromosome[T]] = {
			val chromA = pop.population(new Random().nextInt(pop.population.size))
			val chromB = pop.population(new Random().nextInt(pop.population.size))
			new Pair(chromA, chromB)
			
		}
		
		List(generatePair())
	}
	
}