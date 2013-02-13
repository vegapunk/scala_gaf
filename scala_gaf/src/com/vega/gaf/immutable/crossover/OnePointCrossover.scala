package com.vega.gaf.crossover.impl
import com.vega.gaf.crossover.Crossover
import com.vega.gaf.chromosome.Chromosome
import scala.util.Random
import com.vega.gaf.exception.IncompatibleChromosomeException

class OnePointCrossover[T] extends Crossover[T]{
 
	/**
	 * Perform One Point Crossover on two given genes
	 */
	def crossover(a : Chromosome[T], b: Chromosome[T]) : Chromosome[T] = {
		if( a.genes.size != b.genes.size) throw new IncompatibleChromosomeException()
		val crossPoint= new Random().nextInt(a.genes.size)
		val newGenes = for(val i <- 0 to a.genes.size) yield if (crossPoint < i) a.genes(i) else b.genes(i)
		Chromosome(newGenes.toList)
	}
	
}