package sztuczkap.springframework.sfgpetclinic.services;

import sztuczkap.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long>{

    Owner findByLastNAme(String lastName);

}
