package ie;

import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.search.similarities.BM25Similarity;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String []arg) throws IOException, ParseException, org.apache.lucene.queryparser.classic.ParseException {
        indexer indexer = new indexer();
        indexer.buildDocsIndex();
        Searcher.main(null);
    }
}
