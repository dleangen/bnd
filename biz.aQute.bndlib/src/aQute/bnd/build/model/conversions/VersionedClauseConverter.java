package aQute.bnd.build.model.conversions;

import aQute.bnd.build.model.clauses.*;
import aQute.lib.types.*;
import aQute.libg.header.*;

public class VersionedClauseConverter implements Converter<VersionedClause, Pair<String, Attrs>> {
    public VersionedClause convert(Pair<String, Attrs> input) throws IllegalArgumentException {
    	return new VersionedClause(input.getFirst(), input.getSecond());
    }
}