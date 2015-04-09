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

            
    return duplicates