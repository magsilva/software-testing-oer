ROOT = root
PDFLATEX_OPTS=-file-line-error-style -interaction=nonstopmode
TEXINPUTS=/home/magsilva/Projects/LabES/Courses/Output/SoftwareTestingCourse-DL/CommonAssets: 

PDF_DRAFT_COMPRESSION_RATIO=0
PDF_DRAFT_COMPRESSION_LEVEL=0

PDF_FINAL_COMPRESSION_RATIO=9
PDF_FINAL_COMPRESSION_LEVEL=3

all: clean pdf

distclean: clean
	rm -f *.pdf *.ps

check:
	chktex -n 2 -n 8 -n 6 -n 38 -n 13 -n 36 -n 24 $(ROOT)
	bibclean $(BIBTEX) > /dev/null

clean:
	rm -f *.log *.aux *.toc *.dvi *.bbl *.blg *.*~* examples/*.*~* *.lof *.ilg *.gls *.glo *.backup *.bak.* *.nav *.out *.snm *.gif *.backup *.dat *.vrb *.brf *.fls
	find . -name "*.aux" -delete
	find . -name "*.*~" -delete
	find . -name "*.backup" -delete

ps:
	latex $(ROOT)
	latex $(ROOT)
	dvips -P pdf -ta4 $(ROOT) -o $(ROOT).tmp.ps
	psnup -1 -W128mm -H96mm -pa4 $(ROOT).ps

pdf:
	-TEXINPUTS=$(TEXINPUTS) pdflatex -draftmode $(PDFLATEX_OPTS) "\pdfcompresslevel $(PDF_DRAFT_COMPRESSION_RATIO) \pdfobjcompresslevel $(PDF_DRAFT_COMPRESSION_LEVEL) \input{$(ROOT)}"
	-bibtex $(ROOT)
	TEXINPUTS=$(TEXINPUTS) pdflatex -draftmode $(PDFLATEX_OPTS) "\pdfcompresslevel $(PDF_DRAFT_COMPRESSION_RATIO) \pdfobjcompresslevel $(PDF_DRAFT_COMPRESSION_LEVEL) \input{$(ROOT)}"
	TEXINPUTS=$(TEXINPUTS) pdflatex -draftmode $(PDFLATEX_OPTS) "\pdfcompresslevel $(PDF_DRAFT_COMPRESSION_RATIO) \pdfobjcompresslevel $(PDF_DRAFT_COMPRESSION_LEVEL) \input{$(ROOT)}"
	TEXINPUTS=$(TEXINPUTS) pdflatex $(PDFLATEX_OPTS) "\pdfcompresslevel $(PDF_FINAL_COMPRESSION_RATIO) \pdfobjcompresslevel $(PDF_FINAL_COMPRESSION_LEVEL) \input{$(ROOT)}"
