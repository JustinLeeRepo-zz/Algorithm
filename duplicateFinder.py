def find_duplicate_files(path):
    #dictionary return type lists of lists
    duplicates = {}
    
    #traverses file system
    for dirpath, dirnames, filenames in os.walk(path):
        
        #current directory files
        for(filename in filenames):
            filePath = path + '/' + filename

            fr = open(filePath, 'r')
            #hash each readline of open file
            for line in fr:
                hashIndex = fileHasher(line)
        
                if (hashIndex in duplicates):
                    #open and compare found hashed file with current file
                    frCompare = open(duplicates[hashIndex][0], 'r')
                    if (fr == frCompare):
                        #duplicate found and add. continue with other files in current directory
                        duplicates[hashIndex].append(filePath)
                        frCompare.close()
                        fr.close()
                        break
                    else:
                        #hash next line of file
                        frCompare.close()
                else:
                    #not hashed yet so add list with new file found. continue with other files in current directory
                    duplicates[hashIndex] = [path]
                    fr.close()
                    break        
    #finish traversing filesystem
    #filter through duplicates that were not duplicates
    for duplicate in duplicates:
        if (duplicate.length == 1):
            del duplicates[duplicate]
            
    return duplicates