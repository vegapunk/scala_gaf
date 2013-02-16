package com.vega.gaf.immutable.mutation

import com.vega.gaf.immutable.gene.Gene

trait Mutation[T] {

	def mutate(gene:Gene[T]): Gene[T]
	
}